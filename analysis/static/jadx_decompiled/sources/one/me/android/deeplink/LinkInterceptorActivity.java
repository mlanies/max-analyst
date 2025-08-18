package one.me.android.deeplink;

import android.content.Intent;
import defpackage.im;
import defpackage.oz7;
import defpackage.va1;
import kotlin.Metadata;
import one.me.android.MainActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorActivity;", "Lim;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class LinkInterceptorActivity extends im {
    public static final /* synthetic */ int K0 = 0;

    public final boolean X(Intent intent) {
        String action = intent.getAction();
        if (action == null || oz7.d(action).equals(va1.a)) {
            return false;
        }
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        startActivity(intent2);
        finish();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    @Override // androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Le
            defpackage.jo0.h(r6)
            defpackage.jo0.m(r6)
            goto L11
        Le:
            r6.overridePendingTransition(r2, r2)
        L11:
            android.view.Window r0 = r6.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            r0.setStatusBarColor(r2)
            android.view.View r0 = r0.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            r0.setSystemUiVisibility(r1)
            super.onCreate(r7)
            android.content.Intent r0 = r6.getIntent()
            boolean r0 = r6.X(r0)
            if (r0 == 0) goto L3d
            return
        L3d:
            android.content.Intent r0 = r6.getIntent()
            android.net.Uri r0 = r0.getData()
            r1 = 0
            java.lang.String r2 = "link:result"
            if (r0 != 0) goto L5d
            android.content.Intent r3 = r6.getIntent()
            boolean r3 = r3.hasExtra(r2)
            if (r3 != 0) goto L5d
            r7 = 14
            defpackage.hx9.t(r6, r1, r1, r1, r7)
            r6.finish()
            return
        L5d:
            ul9 r3 = defpackage.ul9.a
            android.content.Intent r3 = r6.getIntent()
            java.lang.String r3 = com.my.tracker.MyTracker.handleDeeplink(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L78
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L79
            goto L78
        L70:
            r3 = move-exception
            java.lang.String r4 = "MyTracker"
            java.lang.String r5 = "fail to handle deep link"
            defpackage.hm9.p(r4, r5, r3)
        L78:
            r3 = r1
        L79:
            w12 r4 = defpackage.s36.b(r6)
            int r5 = defpackage.kvb.root
            r4.setId(r5)
            r6.setContentView(r4)
            znc r7 = defpackage.mr0.c(r6, r4, r7)
            r4 = 1
            r7.e = r4
            r7.Q(r4)
            boolean r4 = r7.n()
            if (r4 != 0) goto Lba
            one.me.android.deeplink.LinkInterceptorWidget r4 = new one.me.android.deeplink.LinkInterceptorWidget
            if (r3 == 0) goto La1
            android.net.Uri r3 = android.net.Uri.parse(r3)
            if (r3 != 0) goto La0
            goto La1
        La0:
            r0 = r3
        La1:
            android.content.Intent r6 = r6.getIntent()
            android.os.Parcelable r6 = r6.getParcelableExtra(r2)
            ej7 r6 = (defpackage.ej7) r6
            r4.<init>(r0, r6)
            coc r6 = defpackage.i24.e(r4, r1, r1)
            java.lang.String r0 = "link"
            r6.d(r0)
            r7.R(r6)
        Lba:
            r7.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.deeplink.LinkInterceptorActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.yb3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        X(intent);
    }
}
