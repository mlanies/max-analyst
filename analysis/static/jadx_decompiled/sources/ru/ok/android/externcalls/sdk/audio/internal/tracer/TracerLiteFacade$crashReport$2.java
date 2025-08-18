package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import defpackage.k56;
import defpackage.qye;
import defpackage.rd7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqye;", "invoke", "()Lqye;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TracerLiteFacade$crashReport$2 extends rd7 implements k56 {
    final /* synthetic */ TracerLiteFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$crashReport$2(TracerLiteFacade tracerLiteFacade) {
        super(0);
        this.this$0 = tracerLiteFacade;
    }

    @Override // defpackage.k56
    public final qye invoke() {
        return new qye(this.this$0.getTracerLite());
    }
}
