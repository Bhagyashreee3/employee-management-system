# Employee Management System

## Project Documentation
This repository contains the Employee Management System which allows for efficient management of employee data.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Bhagyashreee3/employee-management-system.git
   ```
2. Navigate into the project directory:
   ```bash
   cd employee-management-system
   ```
3. Install the required packages:
   ```bash
   npm install
   ```
4. Configure the environment variables in a `.env` file as required.
5. Run the application:
   ```bash
   npm start
   ```

## API Endpoints
- **GET /api/employees**: Retrieve a list of all employees.
- **POST /api/employees**: Add a new employee.
- **GET /api/employees/:id**: Retrieve a single employee by ID.
- **PUT /api/employees/:id**: Update an employee's information.
- **DELETE /api/employees/:id**: Remove an employee from the system.

## Database Schema
- **employees**: 
  - `id`: INTEGER (Primary Key)
  - `name`: VARCHAR(100)
  - `email`: VARCHAR(100)
  - `position`: VARCHAR(50)
  - `date_hired`: DATE

## License
This project is licensed under the MIT License.