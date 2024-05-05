from flask import Flask, render_template, jsonify, request, redirect

app = Flask(__name__)
app.config['JSON_SORT_KEYS'] = False

@app.route("/", methods = ["GET", "POST"])
def index():
    if request.method == "GET":
        return render_template("index.jinja")
    else:
        form = request.form.to_dict()
        name = form["name"]
        data = form["data"]
        aaa = form["aaa"]
        return redirect(f"/api/{name}/{data}/{aaa}")
        

@app.route("/api/<string:name>")
@app.route("/api/<string:name>/<string:data>")
@app.route("/api/<string:name>/<string:data>/<string:aaa>")
def api(**kw):
    return jsonify(kw)

@app.route("/loop/<string:name>/<int:val>")
def loop(name = "aaa", val = 10):
    return render_template("drogas.jinja", name=name, val = val)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)