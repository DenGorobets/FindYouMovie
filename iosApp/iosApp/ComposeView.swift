//
//  ComposeView.swift
//  iosApp
//
//  Created by Денис Горобец on 10/3/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        AppIosKt.MainViewController()
    }
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
}
