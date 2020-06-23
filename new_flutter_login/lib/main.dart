import 'package:flutter/material.dart';
import 'package:newflutterlogin/new_login_screen.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primaryColor: Color(0xFF6200EE),
        primaryColorDark: Color(0xFF3700B3),
        accentColor: Color(0xFF03DAC5),
      ),
      home: NewLoginScreen(),
      builder: (context, child) {
        return Scaffold(
            appBar: AppBar(
              title: Text("New Flutter login embedding"),
            ),
            body: Padding(
                padding: const EdgeInsets.fromLTRB(24, 96, 24, 0),
                child: child));
      },
    );
  }
}
