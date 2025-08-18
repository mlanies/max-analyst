package ru.ok.android.externcalls.sdk.api.extern;

import android.text.TextUtils;
import defpackage.a4c;
import defpackage.nz4;
import defpackage.w9e;
import defpackage.x53;
import defpackage.z84;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser;", "", "La4c;", "log", "<init>", "(La4c;)V", "Lru/ok/android/api/core/ApiInvocationException;", "exception", "", "parseErrorCode", "(Lru/ok/android/api/core/ApiInvocationException;)I", "", "parseExtendedError", "(Lru/ok/android/api/core/ApiInvocationException;)Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "parse", "(Lru/ok/android/api/core/ApiInvocationException;)Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "La4c;", "Companion", "ErrorDescription", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ExternErrorParser {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "ExternErrorParser";
    private final a4c log;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "", "errorCode", "", "extendedError", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getExtendedError", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDescription {
        private final int errorCode;
        private final String extendedError;

        public ErrorDescription(int i, String str) {
            this.errorCode = i;
            this.extendedError = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getExtendedError() {
            return this.extendedError;
        }
    }

    public ExternErrorParser(a4c a4cVar) {
        this.log = a4cVar;
    }

    private final int parseErrorCode(ApiInvocationException exception) {
        List listSingletonList;
        Collection collectionY0;
        try {
            String str = exception.b;
            if (str == null) {
                return 0;
            }
            Pattern patternCompile = Pattern.compile(" : ");
            w9e.N0(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(iEnd, str.length()).toString());
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(str.toString());
            }
            if (listSingletonList.isEmpty()) {
                collectionY0 = nz4.a;
            } else {
                ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionY0 = x53.y0(listSingletonList, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                collectionY0 = nz4.a;
            }
            String[] strArr = (String[]) collectionY0.toArray(new String[0]);
            if (strArr.length < 2 || TextUtils.isEmpty(strArr[1])) {
                return 0;
            }
            return Integer.parseInt(strArr[1]);
        } catch (NumberFormatException e) {
            this.log.reportException(LOG_TAG, "errorcode.parse.failed", e);
            return 0;
        }
    }

    private final String parseExtendedError(ApiInvocationException exception) {
        try {
            String str = exception.Y;
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            if (jSONObject != null) {
                return jSONObject.getString("extended_code");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final ErrorDescription parse(ApiInvocationException exception) {
        return new ErrorDescription(parseErrorCode(exception), parseExtendedError(exception));
    }
}
