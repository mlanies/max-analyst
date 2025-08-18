package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.l60;
import defpackage.r60;
import defpackage.uoa;
import defpackage.z99;

/* loaded from: classes2.dex */
public class AudioSampleEnergyCalculator implements z99 {
    private final Handler mainThreadHandler;
    private final l60 processor = new l60();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.a(j);
    }

    public l60 getProcessor() {
        return this.processor;
    }

    @Override // defpackage.z99
    public void onSample(int i, int i2, int i3, uoa uoaVar) {
        long j = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= uoaVar.a) {
                this.mainThreadHandler.post(new r60(this, (long) Math.sqrt(j / r0), 2));
                return;
            } else {
                short sA = uoaVar.a(i4);
                j += sA * sA;
                i4++;
            }
        }
    }
}
