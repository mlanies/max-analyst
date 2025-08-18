package defpackage;

import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class osf {
    public static final osf X;
    public static final osf Y;
    public static final osf Z;
    public static final b46 c;
    public static final osf o;
    public static final osf s0;
    public static final /* synthetic */ osf[] t0;
    public static final /* synthetic */ v25 u0;
    public final String a;
    public final int b;

    static {
        osf osfVar = new osf("MONEY_BUTTON", 0, 1, "money_button");
        osf osfVar2 = new osf("START_BUTTON", 1, 2, "start_button");
        osf osfVar3 = new osf("URL", 2, 3, "url");
        o = osfVar3;
        osf osfVar4 = new osf("FOLDER", 3, 4, "folder");
        X = osfVar4;
        osf osfVar5 = new osf("INLINE_BUTTON", 4, 5, "inline_button");
        Y = osfVar5;
        osf osfVar6 = new osf("SETTINGS", 5, 6, "settings");
        osf osfVar7 = new osf("SETTINGS_PRIVACY", 6, 9, "settings_privacy");
        osf osfVar8 = new osf("SUPPORT_FROM_PRIVACY", 7, 1000, "support_from_privacy");
        osf osfVar9 = new osf("FROM_NOTIFICATION", 8, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "from_notification");
        Z = osfVar9;
        osf osfVar10 = new osf("FROM_SEARCH", 9, 1003, "from_search");
        s0 = osfVar10;
        osf[] osfVarArr = {osfVar, osfVar2, osfVar3, osfVar4, osfVar5, osfVar6, osfVar7, osfVar8, osfVar9, osfVar10};
        t0 = osfVarArr;
        u0 = new v25(osfVarArr);
        c = new b46();
    }

    public osf(String str, int i, int i2, String str2) {
        this.a = str2;
        this.b = i2;
    }

    public static osf valueOf(String str) {
        return (osf) Enum.valueOf(osf.class, str);
    }

    public static osf[] values() {
        return (osf[]) t0.clone();
    }
}
