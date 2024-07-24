from dbcon.db_connect import details, insertuser, updateuser, medicationinsert, details
from flask import Flask, request, jsonify
from flask_cors import CORS
from flask_restx import Api
import json
# from flask_restx import Api


app = Flask(__name__)
api = Api(app)
CORS(app)
@app.route('/', methods = ['GET', 'POST']) 
def home(): 
    if(request.method == 'GET'): 
  
        data = "hello world"
        return jsonify({'data': data})

@app.route('/alldata',methods = ['GET'])
def alldata():
    result = details()
    res = []
    for item in result:
        res.append({
            'NAME':item.NAME,
            'EMAILID':item.EMAILID,
            'UID':item.UID,
            'MOBILE':item.MOBILE,
            'AGE':item.AGE,
            'ADMITTEDDATE':item.ADMITTEDDATE,
            'PINCODE': item.PINCODE,
            'ADDRESS': item.ADDRESS
        })
    print(res)
    return jsonify(res)
    

@app.route('/adddata',methods = ['POST'])
def addata():
    result = json.loads(request.data)
    print(result)
    res = insertuser(result)
    return jsonify('hello')

@app.route('/medication',methods = ['POST'])
def addmedication():
    result = json.loads(request.data)
    print(result)
    res = medicationinsert(result)
    return jsonify('hello')

# @app.route('/ALLDATA',methods = ['GET'])
# def addmedication():
#     res = details
#     return jsonify('hello')



    
if __name__ == '__main__':
    app.run(debug=True)


