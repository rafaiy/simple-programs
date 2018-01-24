import requests
import urllib
import urllib3
while True:
    session = requests.Session()
    payload = {"GN108669":"email", "5QAGJRFM":"password"}
    payload1 = {"email":"GN108669", "password":"5QAGJRFM", "url":"/reader/"}
    url="http://ebooks.damsdelhi.com/reader/25f5fb2eed7f3de888fb04ea0d3edd18?loginMsg=1#@66f4fe77b97a3f979fc5137ef40180271%next"
    r = session.post('http://ebooks.damsdelhi.com/reader', data=payload1)
    r = session.get(url)
    print(r.text)
