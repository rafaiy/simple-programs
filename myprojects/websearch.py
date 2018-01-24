from bs4 import BeautifulSoup
import requests

def open_url(url):
    list= []
    source_code = requests.get(url).text
   # plain_text =  source_code.text
    soup = BeautifulSoup(source_code, "lxml")
    for link in soup.findAll("a", {'class': 'marginright5 link linkWithHash detailsLinkPromoted'}):
        text_link= link.text
        each_word=text_link.split()
        for word in each_word:
            list.append(word)
    rem_sy(list)

def rem_sy(list):
    clean_list=[]
    symbol="!@#$%^&*()_+=-{}|:?><,./;'[]|"
    for word in list:
        for i in range(0, len(symbol)):
            word = word.replace(symbol[i], " ")
            print(word)
            clean_list.append(" "+ word)



try:
    open_url(r"https://www.olx.in/jaipur/mobiles/?search%5Bdescription%5D=2")
except AttributeError:
    print("check yr connection")