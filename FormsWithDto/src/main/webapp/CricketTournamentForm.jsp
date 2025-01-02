<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Tournament Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #333;
            padding-top: 20px;
        }

        form {
            width: 50%;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        label {
            font-size: 16px;
            margin-bottom: 8px;
            display: block;
        }

        input[type="text"], input[type="email"], input[type="date"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
            font-size: 14px;
        }

        input[type="submit"], .btn-primary {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover, .btn-primary:hover {
            background-color: #45a049;
        }

        .btn-primary {
            background-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }

        .form-section {
            margin-bottom: 20px;
        }

        .clear-button {
            background-color: #f44336;
            padding: 10px 20px;
            border: none;
            color: white;
            border-radius: 4px;
        }

        .clear-button:hover {
            background-color: #e53935;
        }
    </style>
</head>
<body>
    <h2>Cricket Tournament Form</h2>
    <a href="TournamentService"> get all</a>
    <form id="tournamentForm" action="TournamentService" method="post" onsubmit="return validateForm()">
        <div class="form-section">
            <label for="tournamentName">Tournament Name:</label>
            <input type="text" id="tournamentName" name="tournamentName" required>
        </div>
        <div class="form-section">
            <label for="organizerName">Organizer Name:</label>
            <input type="text" id="organizerName" name="organizerName" required>
        </div>
        <div class="form-section">
            <label for="location">Location:</label>
            <input type="text" id="location" name="location" required>
        </div>
        <div class="form-section">
            <label for="startDate">Start Date:</label>
            <input type="date" id="startDate" name="startDate" required>
        </div>
        <div class="form-section">
            <label for="endDate">End Date:</label>
            <input type="date" id="endDate" name="endDate" required>
        </div>
        <div class="form-section">
            <label for="totalTeams">Total Teams:</label>
            <input type="number" id="totalTeams" name="totalTeams" min="1" required>
        </div>
        <div class="form-section">
            <label for="contactNumber">Contact Number:</label>
            <input type="text" id="contactNumber" name="contactNumber" pattern="^\d{10}$" title="Please enter a valid 10-digit phone number" required>
        </div>
        <div class="form-section">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-section">
            <input type="submit" value="Submit">
            <button type="reset" class="clear-button">Clear</button>
        </div>
    </form>

    <script>
        // JavaScript Validation for Date Range
        function validateForm() {
            const startDate = document.getElementById('startDate').value;
            const endDate = document.getElementById('endDate').value;
            const contactNumber = document.getElementById('contactNumber').value;

            // Ensure End Date is after Start Date
            if (new Date(startDate) > new Date(endDate)) {
                alert('End Date must be later than Start Date.');
                return false; // Prevent form submission
            }

            // Validate contact number for 10 digits
            if (!/^\d{10}$/.test(contactNumber)) {
                alert('Please enter a valid 10-digit contact number.');
                return false;
            }

            // If all validation passes
            return true;
        }
    </script>
</body>
</html>
