package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import defpackage.cqd;
import defpackage.e5f;
import defpackage.k56;
import defpackage.l7b;
import defpackage.m56;
import defpackage.rd7;
import defpackage.uye;
import defpackage.wye;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.BuildConfig;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwye;", "invoke", "()Lwye;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TracerLiteFacade$tracerLite$2 extends rd7 implements k56 {
    final /* synthetic */ Context $context;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luye;", "Le5f;", "invoke", "(Luye;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$tracerLite$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements m56 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((uye) obj);
            return e5f.a;
        }

        public final void invoke(uye uyeVar) {
            uyeVar.getClass();
            uyeVar.b = new cqd("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.k56
    public final wye invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        uye uyeVar = new uye();
        anonymousClass1.invoke((Object) uyeVar);
        wye wyeVar = new wye(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new l7b(uyeVar));
        wyeVar.b(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, BuildConfig.SDK_VERSION);
        return wyeVar;
    }
}
