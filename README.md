# ClassEase

ClassEase is a Java-based class management system for students and staff.  
Staff can manage student data (add, update, delete, view) and post announcements.  
Students can view their profile, announcements, timetable, and assignments.  
All data is stored securely in a MySQL database for easy access and management.

---

## Features
- 🔑 **Login system** (Students & Staff)
- 👨‍🎓 **Student Management**: Add, update, delete, view student records
- 📢 **Announcements**: Staff can post updates
- 📚 **Study Resources**: Assignments, test schedules, materials
- 📅 **Timetable Management**
- 🗄 **MySQL Database Integration** (`studenttable.sql` included)

---

## Tech Stack
- ☕ **Java (Core + JDBC)**
- 🗄 **MySQL**
- 📚 **Swing (for UI)**
- 📦 **JCalendar library**

- 
## Project Structure
src/
 *main/ # Main application pages
 *pyqresource/ # Previous year questions
 *studyresources/ # Assignments, class tests, study material
 *timetable/ # Timetable related files


##import studenttable.sql into MySQL
mysql -u root -p studenttable < studenttable.sql

Author

👤 Aadesh Bhavar
🎓 Student, SCOE | Domain: Java Development
