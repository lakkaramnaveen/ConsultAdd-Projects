from django.urls import path
from .views import print_hello, home_page

urlpatterns = [
    path('hello/', print_hello),
    path('home/', home_page),
]
