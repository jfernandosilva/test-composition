package mypackage

class PersonController {

    def index() {
        def p = new Person([homeAddress: [number: "10", code: "ABC"], workAddress: [number: "10", code: "ABC"]])
        p.save()
        render "${p}"
    }
}
