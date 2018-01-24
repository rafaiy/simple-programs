import requests

url = 'http://ebooks.damsdelhi.com/library/books?loginMsg=1'

s = requests.get(url)
print(s.text)











