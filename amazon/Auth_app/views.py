from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
def print_hello(request):
    return HttpResponse("hello world")

def home_page(request):
    return render(request,'Auth_app/index.html')