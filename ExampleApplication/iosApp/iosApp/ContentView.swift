import SwiftUI
import shared

struct ContentView: View {
    let message = MyCommonMain().message()

	var body: some View {
		Text(message)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
