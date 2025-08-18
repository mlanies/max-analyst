package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import defpackage.db7;
import defpackage.kb7;
import defpackage.kl;
import defpackage.ll;
import defpackage.nd2;
import defpackage.sl;
import defpackage.sr0;
import defpackage.t1;
import defpackage.xk;
import defpackage.yk;
import defpackage.ync;
import defpackage.za7;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* loaded from: classes2.dex */
public final class CallAnalyticsApiRequest implements yk {
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final String appVersion;
    private final sr0 items;
    private final CallAnalyticsLogger logger;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, sr0 sr0Var, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
        this.items = sr0Var;
        this.logger = callAnalyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$getOkParser$0(db7 db7Var) throws JsonParseException, IOException {
        this.logger.d(LOG_TAG, "Send response: " + db7Var.H());
        return null;
    }

    private void writeString(kb7 kb7Var, String str, String str2) throws IOException {
        writeString(kb7Var, str, str2, false);
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    @Override // defpackage.yk
    public /* bridge */ /* synthetic */ za7 getFailParser() {
        return nd2.b;
    }

    @Override // defpackage.yk
    public za7 getOkParser() {
        return new ync(14, this);
    }

    @Override // defpackage.fl
    public int getPriority() {
        return 2;
    }

    @Override // defpackage.fl
    public kl getScope() {
        return kl.c;
    }

    @Override // defpackage.yk
    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    @Override // defpackage.fl
    public Uri getUri() {
        return sl.a(this.apiMethod);
    }

    @Override // defpackage.fl
    public boolean shouldGzip() {
        return true;
    }

    @Override // defpackage.fl
    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // defpackage.fl
    public void writeParams(kb7 kb7Var) throws JsonSerializeException, IOException {
        kb7Var.g0("data");
        kb7Var.s();
        writeString(kb7Var, "platform", this.platform, true);
        writeString(kb7Var, "app_version", this.appVersion);
        writeString(kb7Var, "sdk_type", this.sdkType);
        writeString(kb7Var, "sdk_version", this.sdkVersion);
        kb7Var.g0(ClientCookie.VERSION_ATTR);
        ((t1) kb7Var).a(Integer.toString(this.version));
        kb7Var.g0("items");
        this.items.write(kb7Var);
        kb7Var.q();
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ void writeSupplyParams(kb7 kb7Var) throws JsonSerializeException, IOException {
    }

    private void writeString(kb7 kb7Var, String str, String str2, boolean z) throws IOException {
        if (str2 != null) {
            if (z && str2.isEmpty()) {
                return;
            }
            kb7Var.g0(str);
            kb7Var.i(str2);
        }
    }
}
