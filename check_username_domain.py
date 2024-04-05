import subprocess

expected_username = "Rameshwar SHINDE"  

username = subprocess.run(["git", "config", "user.name"], capture_output=True, text=True).stdout.strip()

if username == expected_username:
    print("You are using the correct username, proceeding to commit")
    exit(0)
else:
    print(f"Configured username is not as per config. It should be {expected_username}")
    exit(1)
 
