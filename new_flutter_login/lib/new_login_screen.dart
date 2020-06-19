import 'package:flutter/material.dart';

class NewLoginScreen extends StatefulWidget {
  @override
  _NewLoginScreenState createState() => _NewLoginScreenState();
}

class _NewLoginScreenState extends State<NewLoginScreen> {
  TextEditingController _userNameController = TextEditingController();
  TextEditingController _passwordController = TextEditingController();

  void _credentialsChanges() {}

  @override
  void initState() {
    super.initState();
    _userNameController.addListener(_credentialsChanges);
    _passwordController.addListener(_credentialsChanges);
  }

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Center(
        child: Column(
          children: <Widget>[
            Container(
              child: TextField(
                decoration: InputDecoration(labelText: 'Email'),
                controller: _userNameController,
              ),
            ),
            Container(
              child: TextField(
                decoration: InputDecoration(labelText: 'Password'),
                controller: _passwordController,
                obscureText: true,
              ),
            ),
            Padding(
              padding: const EdgeInsets.fromLTRB(48, 16, 48, 64),
              child: RaisedButton(
                child: Text('SIGN IN OR REGISTER'),
                onPressed: () {},
              ),
            ),
          ],
        ),
      ),
    );
  }

  @override
  void dispose() {
    _userNameController.dispose();
    _passwordController.dispose();
    super.dispose();
  }
}
