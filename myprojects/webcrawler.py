import requests
from bs4 import BeautifulSoup

def web_crawler(max_pages):
    page=1
    while page <= max_pages:
        url = 'https://www.olx.in/jaipur/mobiles/?search%5Bdescription%5D='+str(page)
        page +=1
        source_code = requests.get(url)
        source_text = source_code.text
        links = BeautifulSoup(source_text,'lxml')
        for link in links.findAll('a',{'class':'marginright5 link linkWithHash detailsLinkPromoted','class':'marginright5 link linkWithHash detailsLink'}):
            name = link.findAll('span',False)
            print(name)
            print(link.get('href'))
            open_links(link.get('href'))

def  open_links(link_url):
    source_code = requests.get(link_url)
    source_text = source_code.text
    links=BeautifulSoup(source_text,'lxml')

    for link in links.findAll('p',{'class':'pding10 lheight20 large'}):
        print(link.string)

web_crawler(2)

