package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.media.AudioDeviceCallback;
import defpackage.k56;
import defpackage.rd7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioDeviceCallback;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallsBluethoothDeviceScanner$callback$2 extends rd7 implements k56 {
    final /* synthetic */ CallsBluethoothDeviceScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallsBluethoothDeviceScanner$callback$2(CallsBluethoothDeviceScanner callsBluethoothDeviceScanner) {
        super(0);
        this.this$0 = callsBluethoothDeviceScanner;
    }

    @Override // defpackage.k56
    public final AudioDeviceCallback invoke() {
        return this.this$0.createCallback();
    }
}
