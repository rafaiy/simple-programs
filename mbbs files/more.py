from bs4 import BeautifulSoup
import requests
from lxml import html

payload = {
	"email": "GN108669",
	"password": "5QAGJRFM",
    "url":"/reader/"
}
session_request = requests.session()
login_url = 'http://ebooks.damsdelhi.com/authenticate'
result = session_request.get(login_url)
tree = html.fromstring(result.text)

result = session_request.post(
	login_url,
	data = payload,
	headers = dict(referer=login_url)
)

url = 'http://ebooks.damsdelhi.com/reader/25f5fb2eed7f3de888fb04ea0d3edd18?loginMsg=1#@66f4fe77b97a3f979fc5137ef40180271%next'
result = session_request.get(
	url,
	headers = dict(referer = url)
)
print(result.content)
tree = html.fromstring(result.content)
print(tree)
bucket_names = tree.xpath("//div[@class='repo-list--repo']/a/text()")

print(bucket_names)

result.ok # Will tell us if the last request was ok
result.status_code # Will give us the status from the last request

