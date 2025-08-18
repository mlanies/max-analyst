package ru.ok.android.externcalls.sdk.asr.exceptions;

import defpackage.z84;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/exceptions/AsrException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "jsonObject", "Lorg/json/JSONObject;", "message", "", "cause", "", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getJsonObject", "()Lorg/json/JSONObject;", "getMessage", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsrException extends RuntimeException {
    private final Throwable cause;
    private final JSONObject jsonObject;
    private final String message;

    public AsrException(JSONObject jSONObject) {
        this(jSONObject, null, null, 6, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public AsrException(JSONObject jSONObject, String str) {
        this(jSONObject, str, null, 4, null);
    }

    public /* synthetic */ AsrException(JSONObject jSONObject, String str, Throwable th, int i, z84 z84Var) {
        this(jSONObject, (i & 2) != 0 ? jSONObject.toString() : str, (i & 4) != 0 ? null : th);
    }

    public AsrException(JSONObject jSONObject, String str, Throwable th) {
        super(str, th);
        this.jsonObject = jSONObject;
        this.message = str;
        this.cause = th;
    }
}
