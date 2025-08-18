package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import android.net.Uri;
import defpackage.bqc;
import defpackage.db7;
import defpackage.j1e;
import defpackage.kb7;
import defpackage.kl;
import defpackage.ll;
import defpackage.mqd;
import defpackage.nd2;
import defpackage.sl;
import defpackage.xk;
import defpackage.yk;
import defpackage.za7;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSerializeException;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\"\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest;", "Lyk;", "Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "", "shouldPost", "()Z", "shouldGzip", "shouldReport", "canRepeat", "Lkb7;", "writer", "Le5f;", "writeParams", "(Lkb7;)V", "Lorg/json/JSONObject;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lkl;", "getScope", "()Lkl;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lza7;", "getOkParser", "()Lza7;", "okParser", "Response", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SupportedCodecsApiRequest implements yk {
    private final JSONObject json;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;", "", "success", "", "(Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest;Z)V", "getSuccess", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Response {
        private final boolean success;

        public Response(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    public SupportedCodecsApiRequest(JSONObject jSONObject) {
        this.json = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response _get_okParser_$lambda$0(SupportedCodecsApiRequest supportedCodecsApiRequest, db7 db7Var) {
        return supportedCodecsApiRequest.new Response(mqd.w(db7Var).optBoolean("success", false));
    }

    public boolean canRepeat() {
        return true;
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
        return new bqc(22, this);
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
        return sl.a("vchat.clientSupportedCodecs");
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
    public void writeParams(kb7 writer) throws JsonSerializeException, IOException {
        writer.g0("data");
        j1e.E(writer, this.json);
    }

    @Override // defpackage.fl
    public /* bridge */ /* synthetic */ void writeSupplyParams(kb7 kb7Var) throws JsonSerializeException, IOException {
    }
}
