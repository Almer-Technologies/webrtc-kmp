package com.shepeliev.webrtckmp

import WebRTC.RTCAudioSource

actual class AudioSource internal constructor(override val native: RTCAudioSource) :
    BaseMediaSource(), MediaSource {

    actual override val state: MediaSource.State
        get() = super.state
}