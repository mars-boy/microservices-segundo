from flask import Flask
app = Flask(__name__)

@app.route("/common/deephello")
def hello():
    return "Hello from deep learn"

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8012)
