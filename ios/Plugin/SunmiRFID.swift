import Foundation

@objc public class SunmiRFID: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
