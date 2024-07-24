import pyodbc
from pytz import timezone
import sqlalchemy as db
from flask_restx import  Namespace



api = Namespace('medi_remind', description='mediremind')




conn = pyodbc.connect('DRIVER={SQL Server};SERVER=SHASHANK\SHASHANK;DATABASE=MEDIREMIND;')



cursor = conn.cursor()

def details():
    cursor = conn.cursor()
    cursor.execute(""" SELECT * FROM PATIENTDETAILS """)
    result = cursor.fetchall()
    print(result,'line 16')
    cursor.close()
    return result
    

def insertuser(result):
    cursor = conn.cursor()
    print(result)
    name = result['patientname']
    emailid = result['emailid']
    mobile = result['mobile']
    uid = result['uid']
    age = result['age']
    admitteddate = result['admitteddate']
    pincode = result['pincode']
    address = result['address']

    query = """ INSERT INTO PATIENTDETAILS(NAME, EMAILID, UID, MOBILE, AGE, ADMITTEDDATE, PINCODE, ADDRESS) VALUES(?,?,?,?,?,?,?,?)"""
    values = (name, emailid, uid, mobile, age, admitteddate, pincode, address)
    cursor.execute(query,values)
    conn.commit()
    cursor.close()

def medicationinsert(result):
    cursor = conn.cursor()
    print(result)
    PATID = result['patid']
    MED1 = result['med1']
    MED2 = result['med2']
    MED3 = result['med3']
    MED4 = result['med4']
    MED5 = result['med5']
    MED6 = result['med6']
    MED7 = result['med7']
    MED8 = result['med8']
    MED9 = result['med9']
    MED10 = result['med10']

    query = """ INSERT INTO MEDICATIONS(PATID, MED1, MED2, MED3, MED4, MED5, MED6, MED7, MED8, MED9, MED10) VALUES(?,?,?,?,?,?,?,?,?,?,?)"""
    values = (PATID, MED1, MED2, MED3, MED4, MED5, MED6, MED7, MED8, MED9, MED10)
    cursor.execute(query,values)
    conn.commit()
    cursor.close()

def updateuser():
    cursor = conn.cursor()
    res = cursor.execute(""" UPDATE PATIENT SET NAME = 'Y' WHERE ID = 2 """)
    conn.commit()
    cursor.close()

