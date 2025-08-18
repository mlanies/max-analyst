package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import defpackage.k56;
import defpackage.rd7;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiFileUploader$handler$2 extends rd7 implements k56 {
    final /* synthetic */ MultiFileUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiFileUploader$handler$2(MultiFileUploader multiFileUploader) {
        super(0);
        this.this$0 = multiFileUploader;
    }

    @Override // defpackage.k56
    public final Handler invoke() {
        return new Handler((Looper) this.this$0.looperProvider.get(), new MultiFileUploader.LooperCallback(this.this$0));
    }
}
