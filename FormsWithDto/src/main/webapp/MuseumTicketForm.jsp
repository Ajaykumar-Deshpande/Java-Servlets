<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Museum Ticket Form</title>
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
            font-size: 2rem;
        }

        h2 {
            color: #333;
            font-size: 1.5rem;
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
            width: 100%;
            padding: 12px;
            font-size: 1.1rem;
            border-radius: 5px;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }

        .mt-4 {
            margin-top: 2rem !important;
        }

        .mb-3 {
            margin-bottom: 1.5rem !important;
        }

        .form-check-label {
            font-size: 1rem;
        }

        select {
            cursor: pointer;
        }

        .form-check-input {
            width: 20px;
            height: 20px;
            margin-top: 0.3rem;
        }

        /* Styling for the ticket details section */
        .ticket-details p {
            font-size: 1rem;
            color: #333;
        }

        .ticket-details strong {
            color: #007bff;
        }

        /* Responsive design for smaller screens */
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

            .btn-primary {
                font-size: 1rem;
                padding: 10px;
            }
        }
    </style>
</head>
<body>

    <div class="container mt-4">
        <h1>Museum Ticket Form</h1>
        <a href="send"> get all</a>

        <!-- Displaying customer data -->
        <p>${message}</p>
        <!-- Ticket form -->
        <form id="ticketForm" action="send" method="post" class="mt-4">
            <div class="row">
                <!-- Customer Name -->
                <div class="col-md-6 mb-3">
                    <label for="customerName" class="form-label">Customer Name</label>
                    <input type="text" name="customerName" id="customerName" class="form-control" placeholder="Enter Customer Name" required>
                </div>

                <!-- Number of Adults -->
                <div class="col-md-6 mb-3">
                    <label for="numOfAdults" class="form-label">Number of Adults</label>
                    <input type="number" name="numOfAdults" id="numOfAdults" class="form-control" placeholder="Enter Number of Adults" required min="1">
                </div>
            </div>

            <div class="row">
                <!-- Number of Children -->
                <div class="col-md-6 mb-3">
                    <label for="numOfChildren" class="form-label">Number of Children</label>
                    <input type="number" name="numOfChildren" id="numOfChildren" class="form-control" placeholder="Enter Number of Children" required min="0">
                </div>

                <!-- Mobile Number -->
                <div class="col-md-6 mb-3">
                    <label for="mobileNumber" class="form-label">Mobile Number</label>
                    <input type="tel" name="mobileNumber" id="mobileNumber" class="form-control" placeholder="Enter Mobile Number" required pattern="^\d{10}$" title="Please enter a valid 10-digit mobile number">
                </div>
            </div>

            <div class="row">
                <!-- Email -->
                <div class="col-md-6 mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" name="email" id="email" class="form-control" placeholder="Enter Your Email" required>
                </div>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-primary mt-2">Clear</button>

        </form>
    </div>

    <!-- Bootstrap JS (optional but for modal, tooltips, etc.) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0v8Fqkdo/4u2otp8J4oy2O2lmb2a9E3AC29j2tSFCp7w7txN" crossorigin="anonymous"></script>

    <!-- Custom JS for form validation -->
    <script>
        // Form Validation before submission
        document.getElementById('ticketForm').addEventListener('submit', function(event) {
            // Check if all required fields are filled
            let valid = true;

            const customerName = document.getElementById('customerName').value.trim();
            const numOfAdults = document.getElementById('numOfAdults').value.trim();
            const numOfChildren = document.getElementById('numOfChildren').value.trim();
            const mobileNumber = document.getElementById('mobileNumber').value.trim();
            const email = document.getElementById('email').value.trim();

            // Validate customer name
            if (customerName === "") {
                valid = false;
                alert("Please enter the customer name.");
            }

            // Validate number of adults
            if (numOfAdults === "" || numOfAdults < 1) {
                valid = false;
                alert("Please enter a valid number of adults.");
            }

            // Validate mobile number (10 digits)
            const mobileRegex = /^\d{10}$/;
            if (!mobileRegex.test(mobileNumber)) {
                valid = false;
                alert("Please enter a valid 10-digit mobile number.");
            }

            // Validate email
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                valid = false;
                alert("Please enter a valid email address.");
            }

            // Prevent form submission if validation fails
            if (!valid) {
                event.preventDefault();
            }
        });
    </script>
</body>
</html>
