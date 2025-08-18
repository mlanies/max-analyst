package ru.ok.android.externcalls.sdk.audio.internal.impl;

import defpackage.e5f;
import defpackage.m56;
import defpackage.rd7;
import defpackage.wg0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ex", "Le5f;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$1 extends rd7 implements m56 {
    final /* synthetic */ int $profile;
    final /* synthetic */ CallsBluetoothManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$1(CallsBluetoothManager callsBluetoothManager, int i) {
        super(1);
        this.this$0 = callsBluetoothManager;
        this.$profile = i;
    }

    @Override // defpackage.m56
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return e5f.a;
    }

    public final void invoke(Throwable th) {
        this.this$0.logger.reportError(CallsBluetoothManager.LOG_TAG, wg0.g(this.$profile, "Error at onServiceConnected(", ")"), th);
    }
}
