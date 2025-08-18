package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.content.Intent;
import defpackage.e5f;
import defpackage.k56;
import defpackage.rd7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1 extends rd7 implements k56 {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ CallsBluetoothManager this$0;
    final /* synthetic */ CallsBluetoothManager.BluetoothHeadsetBroadcastReceiver this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1(CallsBluetoothManager callsBluetoothManager, Intent intent, CallsBluetoothManager.BluetoothHeadsetBroadcastReceiver bluetoothHeadsetBroadcastReceiver) {
        super(0);
        this.this$0 = callsBluetoothManager;
        this.$intent = intent;
        this.this$1 = bluetoothHeadsetBroadcastReceiver;
    }

    @Override // defpackage.k56
    public /* bridge */ /* synthetic */ Object invoke() {
        m91invoke();
        return e5f.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m91invoke() {
        this.this$0.onBroadcastReceiveImpl(this.$intent, this.this$1.isInitialStickyBroadcast());
    }
}
