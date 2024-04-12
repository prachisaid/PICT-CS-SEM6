responses = {
    "hello": "Hi there! How can I assist you today?",
    "products": "We have a variety of products available: shoes and clothing.",
    "shoes": "We offer a range of shoes including sneakers, boots, and sandals.",
    "sneakers": "Sneakers: Comfortable shoes for casual wear.",
    "boots": "Boots: Sturdy footwear suitable for various outdoor activities.",
    "sandals": "Sandals: Open-toed shoes perfect for warm weather.",
    "clothing": "Our clothing selection includes shirts, pants, and jackets.",
    "shirts": "Shirts: Various styles and colors available.",
    "pants": "Pants: Casual and formal options available.",
    "jackets": "Jackets: Stay warm with our stylish jackets.",
    "bye": "Goodbye! Have a great day!",
    "default": "I'm sorry, I didn't quite understand that."
}

print("Chatbot: Hi! Welcome.")
while True:
    user_input = input("User: ").lower()
    if any(keyword in user_input for keyword in responses):
        for keyword, response in responses.items():
            if keyword in user_input:
                print("Chatbot:", response)
                break
        if "bye" in user_input:
            break
    else:
        print("Chatbot:", responses["default"])