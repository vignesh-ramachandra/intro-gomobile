//
//  ViewController.swift
//  Demoapp
//
//  Created by Vignesh Ramachandra on 24/07/18.
//  Copyright © 2018 Vignesh Ramachandra. All rights reserved.
//

import UIKit
import Demo

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func onButtonTapped(_ sender: UIButton) {
        
        DemoGetUserViewModel(DemoResponder())
    }
    
//    func onErrorResponse(String)
    
    
}


class DemoResponder: DemoAPIResponse {
    override func onErrorResponse(_ error: String!) {
        
    }
    
    override func onSuccessResponse(_ response: Data!) {
        
    }
}

