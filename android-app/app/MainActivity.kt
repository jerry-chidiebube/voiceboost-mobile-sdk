package com.voiceboost.app 
import android.os.Bundle 
import androidx.appcompat.app.AppCompatActivity 
import com.voiceboost.sdk.VoiceBoostManager 
class MainActivity : AppCompatActivity() { 
    private val voiceBoost = VoiceBoostManager() 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        voiceBoost.initialize() 
        voiceBoost.startEnhancement() 
    } 
} 
