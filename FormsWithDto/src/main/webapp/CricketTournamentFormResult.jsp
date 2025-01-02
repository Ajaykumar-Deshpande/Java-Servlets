<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Tournament</title>
    <!-- Add Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEJ6D+OR9l3IMkrrwF0c9a5n19c6H1O2d6aS4oyPv5S8R9c7xgJwW1OXz0Ikd" crossorigin="anonymous">

    <style>
        /* Custom CSS for page styling */
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            color: #495057;
            padding-top: 50px;
        }

        h1 {
            color: #007bff;
            font-weight: 600;
        }

        .card {
            background-color: #ffffff;
            border-radius: 8px;
            border: 1px solid #ddd;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin-bottom: 30px;
        }

        .card h3 {
            color: #333;
            line-height: 1.8;
            font-size: 18px;
        }

        .card p {
            font-size: 16px;
            color: #6c757d;
        }

        .alert {
            background-color: #d4edda;
            border-color: #c3e6cb;
            color: #155724;
            font-size: 18px;
            padding: 20px;
            border-radius: 8px;
        }

        .alert-heading {
            font-weight: bold;
            font-size: 22px;
        }

        /* Add some margin between the content and the container */
        .container {
            padding: 20px;
        }

        /* Center the content */
        .text-center {
            text-align: center;
        }

        .mb-4 {
            margin-bottom: 1.5rem;
        }

        /* Style for the success message */
        .alert-success {
            border-left: 5px solid #28a745;
        }
    </style>

</head>
<body>
    <div class="container mt-4">
        <h1 class="text-center mb-4">Cricket Tournament Form Details</h1>

        <!-- Tournament details card -->
        <div class="card p-4 shadow-sm">
            <h3 class="mb-3">
                <strong>Tournament Name:</strong> ${tournamentOrder.tournamentName} <br>
                <strong>Organizer Name:</strong> ${tournamentOrder.organizerName} <br>
                <strong>Location:</strong> ${tournamentOrder.location} <br>
                <strong>Start Date:</strong> ${tournamentOrder.startDate} <br>
                <strong>End Date:</strong> ${tournamentOrder.endDate} <br>
                <strong>Total Teams:</strong> ${tournamentOrder.totalTeams} <br>
                <strong>Contact Number:</strong> ${tournamentOrder.contactNumber} <br>
                <strong>Email:</strong> ${tournamentOrder.email}
            </h3>
        </div>

        <!-- Success alert message -->
        <div class="alert alert-success mt-4" role="alert">
            <h4 class="alert-heading">Booked Successfully!</h4>
            <p>Your cricket tournament has been booked successfully. We will contact you soon.</p>
        </div>
    </div>

    <!-- Bootstrap JS (optional but for modal, tooltips, etc.) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0v8Fqkdo/4u2otp8J4oy2O2lmb2a9E3AC29j2tSFCp7w7txN" crossorigin="anonymous"></script>
</body>
</html>
