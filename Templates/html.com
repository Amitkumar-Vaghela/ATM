{% extends "base.html" %}

{% block content %}
  <div class="flex flex-col items-center justify-center min-h-screen bg-gray-100 p-4">
    <div class="bg-white shadow-md rounded-lg p-6 max-w-4xl w-full">
      <div class="flex justify-between items-center mb-6">
        <div class="flex items-center space-x-4">
          <img src="{{ url_for('static', filename='images/bok_logo.png') }}" alt="BOK Logo" class="h-12">
          <div>
            <h1 class="text-xl font-bold text-blue-900">BOK</h1>
            <p class="text-sm text-gray-500">We find ways</p>
          </div>
        </div>
        <div class="flex flex-col bg-yellow-400 p-4 rounded-lg text-center">
          <div class="text-sm font-semibold">ACCOUNT NAME</div>
          <div class="text-lg font-bold">Juan, Dela Cruz</div>
          <div class="text-sm font-semibold mt-2">ACCOUNT NUMBER</div>
          <div class="text-lg font-bold">12345 658910</div>
          <div class="text-sm font-semibold mt-2">Remaining Balance:</div>
          <div class="text-lg font-bold">₱85,500.00</div>
        </div>
      </div>
      <div class="grid grid-cols-3 gap-4 mb-6">
        <button class="bg-blue-700 text-white py-4">Withdrawal</button>
        <button class="bg-blue-700 text-white py-4">Balance Inquiry</button>
        <button class="bg-blue-700 text-white py-4">Pay Bills</button>
        <button class="bg-blue-700 text-white py-4">Funds Transfer</button>
        <button class="bg-blue-700 text-white py-4">Fast Cash</button>
        <button class="bg-blue-700 text-white py-4">Cash Deposit</button>
        <button class="bg-blue-700 text-white py-4">Cash Card/Airtime Reload</button>
      </div>
      <div class="mb-4 text-gray-500">Other Transactions</div>
      <div class="grid grid-cols-3 gap-4">
        <button class="bg-blue-700 text-white py-4">PIN Change</button>
        <button class="bg-blue-700 text-white py-4">New ATM Card Activation
