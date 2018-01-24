import requests
from requests import Session


s = requests.get("http://www.google.com/search?ie=ISO-8859-1", {"hl":"en-IN","source":"hp","q":"hello", "btnG":"Google+Search","gbv":"1"})
print(s.text)












