import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp();
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Flutter App"),
          actions: const [
            Padding(
              padding: EdgeInsets.only(right: 20),
              child: Icon(Icons.info),
            ),
          ],
        ),
        backgroundColor: const Color.fromARGB(255, 224, 224, 224),
        drawer: Drawer(
          child: SafeArea(
            child: Column(
              children: [
                Container(
                  margin: EdgeInsets.fromLTRB(0, 100, 0, 0),
                  child: const Text(
                      "Contact Us",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 20,
                      )
                  ),
                ),
                Container(
                  margin: EdgeInsets.fromLTRB(0, 50, 0, 0),
                  child: const Text(
                      "Menu",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 20,
                      )
                  ),
                ),
                Container(
                  margin: EdgeInsets.fromLTRB(0, 50, 0, 0),
                  child: const Text(
                      "Home",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 20,
                      )
                  ),
                ),
                Container(
                  margin: EdgeInsets.fromLTRB(0, 50, 0, 0),
                  child: const Text(
                      "More",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 20,
                      )
                  ),
                ),
                Container(
                  margin: EdgeInsets.fromLTRB(0, 50, 0, 0),
                  child: const Text(
                      "About",
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 20,
                      )
                  ),
                ),
              ],
            ),
          ),
        ),
        body: SafeArea(
          child: ListView(
            children: [
              SizedBox(height: 30),
              // Object
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                mainAxisSize: MainAxisSize.max,
                textDirection: TextDirection.ltr,
                children: [
                  // Card
                  Container(
                    decoration: BoxDecoration(
                      color: Color.fromARGB(240, 199, 199, 199),
                      borderRadius: BorderRadius.circular(30),
                    ),
                    width: 290,
                    margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                    // Components
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        SizedBox(height: 30),
                        // Image
                        Center(
                          child: CircleAvatar(
                            radius: 85,
                            backgroundImage: AssetImage('images/ph1.jpg'),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Text
                        Center(
                          child: Text(
                            "Omar Salem",
                            style: TextStyle(color: Colors.black, fontSize: 22),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Call Box
                        Center(
                          child: Container(
                            decoration: BoxDecoration(
                              color: Colors.red,
                              borderRadius: BorderRadius.circular(15),
                            ),
                            height: 50,
                            width: 200,
                            child: Row(
                              children: [
                                // Icon
                                Container(
                                  margin: EdgeInsets.fromLTRB(15, 0, 0, 0),
                                  child: Icon(Icons.phone, color: Colors.black),
                                ),
                                // Call Now
                                Container(
                                  margin: EdgeInsets.fromLTRB(25, 0, 0, 0),
                                  child: Text(
                                    "Call Now!",
                                    style: TextStyle(
                                      color: Colors.black,
                                      fontSize: 20,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              ],
                            ),
                          ),
                        ),
                        SizedBox(height: 50),
                      ],
                    ),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                mainAxisSize: MainAxisSize.max,
                textDirection: TextDirection.ltr,
                children: [
                  // Card
                  Container(
                    decoration: BoxDecoration(
                      color: Color.fromARGB(240, 199, 199, 199),
                      borderRadius: BorderRadius.circular(30),
                    ),
                    width: 290,
                    margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                    // Components
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        SizedBox(height: 30),
                        // Image
                        Center(
                          child: CircleAvatar(
                            radius: 85,
                            backgroundImage: AssetImage('images/ph0.jpg'),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Text
                        Center(
                          child: Text(
                            "Mohamad ahmad",
                            style: TextStyle(color: Colors.black, fontSize: 22),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Call Box
                        Center(
                          child: Container(
                            decoration: BoxDecoration(
                              color: Colors.red,
                              borderRadius: BorderRadius.circular(15),
                            ),
                            height: 50,
                            width: 200,
                            child: Row(
                              children: [
                                // Icon
                                Container(
                                  margin: EdgeInsets.fromLTRB(15, 0, 0, 0),
                                  child: Icon(Icons.phone, color: Colors.black),
                                ),
                                // Call Now
                                Container(
                                  margin: EdgeInsets.fromLTRB(25, 0, 0, 0),
                                  child: Text(
                                    "Call Now!",
                                    style: TextStyle(
                                      color: Colors.black,
                                      fontSize: 20,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              ],
                            ),
                          ),
                        ),
                        SizedBox(height: 50),
                      ],
                    ),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                mainAxisSize: MainAxisSize.max,
                textDirection: TextDirection.ltr,
                children: [
                  // Card
                  Container(
                    decoration: BoxDecoration(
                      color: Color.fromARGB(240, 199, 199, 199),
                      borderRadius: BorderRadius.circular(30),
                    ),
                    width: 290,
                    margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                    // Components
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        SizedBox(height: 30),
                        // Image
                        Center(
                          child: CircleAvatar(
                            radius: 85,
                            backgroundImage: AssetImage('images/ph2.jpg'),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Text
                        Center(
                          child: Text(
                            "Moneer Osama",
                            style: TextStyle(color: Colors.black, fontSize: 22),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Call Box
                        Center(
                          child: Container(
                            decoration: BoxDecoration(
                              color: Colors.red,
                              borderRadius: BorderRadius.circular(15),
                            ),
                            height: 50,
                            width: 200,
                            child: Row(
                              children: [
                                // Icon
                                Container(
                                  margin: EdgeInsets.fromLTRB(15, 0, 0, 0),
                                  child: Icon(Icons.phone, color: Colors.black),
                                ),
                                // Call Now
                                Container(
                                  margin: EdgeInsets.fromLTRB(25, 0, 0, 0),
                                  child: Text(
                                    "Call Now!",
                                    style: TextStyle(
                                      color: Colors.black,
                                      fontSize: 20,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              ],
                            ),
                          ),
                        ),
                        SizedBox(height: 50),
                      ],
                    ),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                mainAxisSize: MainAxisSize.max,
                textDirection: TextDirection.ltr,
                children: [
                  // Card
                  Container(
                    decoration: BoxDecoration(
                      color: Color.fromARGB(240, 199, 199, 199),
                      borderRadius: BorderRadius.circular(30),
                    ),
                    width: 290,
                    margin: EdgeInsets.fromLTRB(10, 10, 10, 10),
                    // Components
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        SizedBox(height: 30),
                        // Image
                        Center(
                          child: CircleAvatar(
                            radius: 85,
                            backgroundImage: AssetImage('images/ph3.jpg'),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Text
                        Center(
                          child: Text(
                            "Ziad Jamal",
                            style: TextStyle(color: Colors.black, fontSize: 22),
                          ),
                        ),
                        SizedBox(height: 30),
                        // Call Box
                        Center(
                          child: Container(
                            decoration: BoxDecoration(
                              color: Colors.red,
                              borderRadius: BorderRadius.circular(15),
                            ),
                            height: 50,
                            width: 200,
                            child: Row(
                              children: [
                                // Icon
                                Container(
                                  margin: EdgeInsets.fromLTRB(15, 0, 0, 0),
                                  child: Icon(Icons.phone, color: Colors.black),
                                ),
                                // Call Now
                                Container(
                                  margin: EdgeInsets.fromLTRB(25, 0, 0, 0),
                                  child: Text(
                                    "Call Now!",
                                    style: TextStyle(
                                      color: Colors.black,
                                      fontSize: 20,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              ],
                            ),
                          ),
                        ),
                        SizedBox(height: 50),
                      ],
                    ),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
      debugShowMaterialGrid: false,
      debugShowCheckedModeBanner: false,
    );
  }
}
