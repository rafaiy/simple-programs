from requests import Session



url = 'http://ebooks.damsdelhi.com/authenticate'
urlopen = 'http://ebooks.damsdelhi.com/reader/25f5fb2eed7f3de888fb04ea0d3edd18?loginMsg=1#@66f4fe77b97a3f979fc5137ef40180271%next'
payload = {"email":"GN108669", "password":"5QAGJRFM"}
s = Session()
s.post(url,payload)
source_code = s.get(urlopen)
print(source_code.text)

"""http://ebooks.damsdelhi.com/library/books?loginMsg=1"""








