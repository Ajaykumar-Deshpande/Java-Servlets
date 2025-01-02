<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Milk Order Form</title>
    <!-- Add Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEJ6D+OR9l3IMkrrwF0c9a5n19c6H1O2d6aS4oyPv5S8R9c7xgJwW1OXz0Ikd" crossorigin="anonymous">
    <!-- Add Custom CSS -->
    <style>
        body {
            background-color: #f4f4f9;
            font-family: 'Arial', sans-serif;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #007bff;
            text-align: center;
        }
        h3 {
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
        .mt-4 {
            margin-top: 1.5rem !important;
        }
        .mb-3 {
            margin-bottom: 1rem !important;
        }
    </style>
</head>
<body>
    <div class="container mt-4">
        <h1>Milk Order Form</h1>
         <a href="milkform"> get all</a>
        <!-- Display brand, type, and total price -->
        <!-- Milk Order Form -->
        <form action="milkform" method="post" class="mt-4" id="milkForm" onsubmit="return validateForm()">
            <h2>${milkform.brand}</h2>
            <h2>${milkform.type}</h2>
            <h2>${milkform.quantity}</h2>
            <h2>${milkform.total}</h2>
            <div class="row">
                <!-- Brand Input -->
                <div class="col-md-4 mb-3">
                    <label for="brand" class="form-label">Brand</label>
                    <input type="text" name="brand" id="brand" class="form-control" placeholder="Enter Milk Brand" required>
                </div>
                <!-- Type Select -->
                <div class="col-md-4 mb-3">
                    <label for="type" class="form-label">Type</label>
                    <select name="type" id="type" class="form-select" required>
                        <option value="special">Special</option>
                        <option value="ordinary">Ordinary</option>
                        <option value="goodlife">Goodlife</option>
                        <option value="goodlifeLite">Goodlife Lite</option>
                        <option value="family">Family</option>
                        <option value="buffalo">Buffalo</option>
                    </select>
                </div>
                <!-- Quantity Input -->
                <div class="col-md-4 mb-3">
                    <label for="quantity" class="form-label">Quantity</label>
                    <input type="number" name="quantity" id="quantity" class="form-control" placeholder="Enter Quantity" min="1" required>
                </div>
            </div>
            <!-- Submit Button -->
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
                <!-- Clear Button to reset the form -->
                <button type="reset" class="btn btn-secondary">Clear</button>
            </div>
        </form>
    </div>
    <!-- Bootstrap JS (optional but for modal, tooltips, etc.) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0v8Fqkdo/4u2otp8J4oy2O2lmb2a9E3AC29j2tSFCp7w7txN" crossorigin="anonymous"></script>
    <script>
        // Custom form validation
        function validateForm() {
            var brand = document.getElementById("brand").value;
            var quantity = document.getElementById("quantity").value;
            var type = document.getElementById("type").value;

            if (!brand.trim()) {
                alert("Brand cannot be empty!");
                return false;
            }

            if (quantity <= 0) {
                alert("Quantity must be a positive number.");
                return false;
            }

            // Add any further checks for other fields if necessary
            return true;
        }
    </script>
</body>
</html>
