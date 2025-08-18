package ru.ok.messages.location;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import defpackage.dy7;
import defpackage.er7;
import defpackage.q5;
import defpackage.w46;
import defpackage.xxb;
import defpackage.yyb;

/* loaded from: classes2.dex */
public class ActLocationMap extends q5 implements w46 {
    public static final /* synthetic */ int U0 = 0;

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.q5
    public final void c0(int i, int i2, Intent intent) {
        a aVarE = S().E("ru.ok.messages.location.FrgLocationMap");
        if (aVarE instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarE).l1(i, i2, intent);
        }
    }

    @Override // defpackage.w46
    public final void d() {
        a aVarE = S().E("ru.ok.messages.location.FrgLocationMap");
        if (aVarE instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarE).d();
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yyb.act_single_fragment);
        f0(this.N0.L);
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0L);
        long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_ID", 0L);
        long longExtra3 = intent.getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0L);
        er7 er7Var = (er7) intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
        if (er7Var == null) {
            er7Var = er7.Z;
        }
        float floatExtra = intent.getFloatExtra("ru.ok.tamtam.extra.ZOOM", 14.0f);
        boolean booleanExtra = intent.getBooleanExtra("ru.ok.tamtam.extra.LIVE", false);
        long longExtra4 = intent.getLongExtra("ru.ok.tamtam.extra.DATE", 0L);
        long longExtra5 = intent.getLongExtra("map:REQUEST_MESSAGE_ID", 0L);
        boolean booleanExtra2 = intent.getBooleanExtra("ru.ok.tamtam.extra.ACTIVE", false);
        String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.DEVICE_ID");
        boolean booleanExtra3 = intent.getBooleanExtra("map:DISABLE_LIVE", false);
        boolean booleanExtra4 = intent.getBooleanExtra("map:REGULAR_SENDING", true);
        FrgLocationMap frgLocationMap = new FrgLocationMap();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("ru.ok.tamtam.extra.CHAT_ID", longExtra);
        bundle2.putLong("ru.ok.tamtam.extra.MESSAGE_ID", longExtra2);
        bundle2.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra3);
        bundle2.putSerializable("ru.ok.tamtam.extra.LOCATION", er7Var);
        bundle2.putFloat("ru.ok.tamtam.extra.ZOOM", floatExtra);
        bundle2.putBoolean("ru.ok.tamtam.extra.LIVE", booleanExtra);
        bundle2.putLong("ru.ok.tamtam.extra.DATE", longExtra4);
        bundle2.putLong("ru.ok.tamtam.extra.REQUEST_MESSAGE_ID", longExtra5);
        bundle2.putBoolean("ru.ok.tamtam.extra.ACTIVE", booleanExtra2);
        bundle2.putString("ru.ok.tamtam.extra.DEVICE_ID", stringExtra);
        bundle2.putBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", booleanExtra3);
        bundle2.putBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", booleanExtra4);
        frgLocationMap.X0(bundle2);
        dy7.e(S(), xxb.act_single_fragment__container, frgLocationMap, "ru.ok.messages.location.FrgLocationMap");
    }

    @Override // defpackage.w46
    public final void v() {
        a aVarE = S().E("ru.ok.messages.location.FrgLocationMap");
        if (aVarE instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarE).getClass();
        }
    }

    @Override // defpackage.w46
    public final void x() {
        a aVarE = S().E("ru.ok.messages.location.FrgLocationMap");
        if (aVarE instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarE).getClass();
        }
    }
}
