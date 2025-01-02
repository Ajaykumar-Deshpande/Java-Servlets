<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sweets Order Form</title>
    <!-- Add Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEJ6D+OR9l3IMkrrwF0c9a5n19c6H1O2d6aS4oyPv5S8R9c7xgJwW1OXz0Ikd" crossorigin="anonymous">

    <!-- Add Custom CSS -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }

        .container {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #007bff;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        .form-label {
            font-weight: bold;
        }

        .form-control, .form-select {
            border-radius: 5px;
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }

        .mt-3 {
            margin-top: 1rem !important;
        }

        .mb-3 {
            margin-bottom: 1rem !important;
        }

        .form-check-label {
            font-size: 1rem;
        }

        select {
            cursor: pointer;
        }

        /* Custom styles for the Submit button */
        .btn-primary {
            width: 100%;
            padding: 10px;
            font-size: 1.1rem;
            border-radius: 5px;
        }

        .form-check-input {
            width: 20px;
            height: 20px;
            margin-top: 0.3rem;
        }

        /* Adjust layout on smaller screens */
        @media (max-width: 768px) {
            .container {
                padding: 15px;
            }
            h1 {
                font-size: 1.5rem;
            }
            .form-label {
                font-size: 0.9rem;
            }
        }
    </style>
</head>
<body>
    <div class="container mt-4">
        <h1>Sweets Order Form</h1>
        <a href="sweet"> get all</a>

        <!-- Display Shop and Sweet Name -->
        <div class="mt-3">
            <h2>${ShopName}</h2>
            <h2>${SweetName}</h2>
            <h2>${sweetPrice}</h2>
        </div>

        <!-- Order Form -->
        <form id="orderForm" action="sweet" method="post">
            <div class="row">
                <!-- Shop Name -->
                <div class="col-md-6 mb-3">
                    <label for="ShopName" class="form-label">Shop Name</label>
                    <select name="ShopName" id="ShopName" class="form-select" required>
                        <option value="">Select Shop</option>
                        <option value="Ayangar_Shop">Ayangar Shop</option>
                        <option value="Ganesh_Sweets">Ganesh Sweets</option>
                        <option value="Shanti_Sagar">Shanti Sagar</option>
                    </select>
                </div>

                <!-- Sweet Name -->
                <div class="col-md-6 mb-3">
                    <label for="SweetName" class="form-label">Sweet Name</label>
                    <select name="SweetName" id="SweetName" class="form-select" required>
                        <option value="">Select Sweet</option>
                        <option value="Karadantu">Karadantu</option>
                        <option value="Ladu">Ladu</option>
                        <option value="DarvadPeda">Darvad Peda</option>
                    </select>
                </div>
            </div>

            <!-- Special Option -->
            <div class="form-check mb-3">
                <input type="checkbox" name="Special" class="form-check-input" id="Special">
                <label class="form-check-label" for="Special">Special</label>
            </div>

            <!-- Quantity -->
            <div class="mb-3">
                <label for="quantity" class="form-label">Quantity (in KG)</label>
                <select name="quantity" id="quantity" class="form-select" required>
                    <option value="">Select Quantity</option>
                    <option value="1">1 KG</option>
                    <option value="2">2 KG</option>
                    <option value="3">3 KG</option>
                </select>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-primary">Clear</button>
        </form>
    </div>

    <!-- Bootstrap JS (optional for features like modals, tooltips, etc.) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0v8Fqkdo/4u2otp8J4oy2O2lmb2a9E3AC29j2tSFCp7w7txN" crossorigin="anonymous"></script>

    <!-- Custom JS for form validation -->
    <script>
        document.getElementById('orderForm').addEventListener('submit', function(event) {
            // Get the selected values
            const shopName = document.getElementById('ShopName').value.trim();
            const sweetName = document.getElementById('SweetName').value.trim();
            const quantity = document.getElementById('quantity').value.trim();

            let valid = true;
            let errorMessage = "";

            // Check if all required fields are filled
            if (!shopName) {
                valid = false;
                errorMessage += "Please select a shop.\n";
            }
            if (!sweetName) {
                valid = false;
                errorMessage += "Please select a sweet.\n";
            }
            if (!quantity) {
                valid = false;
                errorMessage += "Please select a quantity.\n";
            }

            // If validation fails, prevent form submission and show alert
            if (!valid) {
                alert(errorMessage);
                event.preventDefault();
            }
        });
    </script>
</body>
</html>
