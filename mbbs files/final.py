import requests
from requests import sessions,Session
from bs4 import *
from selenium import webdriver
from seleniumrequests import Chrome

#<img class="bi x0 y0 w0 h0" alt="" src="/reader/25f5fb2eed7f3de888fb04ea0d3edd18/assets/bg2.jpg

payload = {"email":"GN108669", "password":"5QAGJRFM", "url":"%2Flibrary%2Fbooks"}
webdriver = Chrome()
s = webdriverSession.post(url='http://ebooks.damsdelhi.com/authenticate?age=',data=payload)


#s = webDriver.get(url='http://ebooks.damsdelhi.com/authenticate?age=&email=GN108669&password=5QAGJRFM&url=%2Flibrary%2Fbooks')
#source_code = s.get("http://ebooks.damsdelhi.com/authenticate?age=&email=GN108669&password=5QAGJRFM&url=%2Flibrary%2Fbooks")

print(s)



















