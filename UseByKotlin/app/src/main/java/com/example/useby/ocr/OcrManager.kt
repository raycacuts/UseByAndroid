package com.example.useby.ocr

import android.graphics.Bitmap
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import kotlinx.coroutines.tasks.await

object OcrManager {
    suspend fun recognize(bitmap: Bitmap): String {
        val recognizer = TextRecognition.getClient()
        val result = recognizer.process(InputImage.fromBitmap(bitmap, 0)).await()
        return result.text
    }
}
