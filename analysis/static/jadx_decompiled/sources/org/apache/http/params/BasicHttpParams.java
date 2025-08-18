package org.apache.http.params;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private HashMap parameters;

    public void clear() {
        this.parameters = null;
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpParams basicHttpParams = (BasicHttpParams) super.clone();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public void copyParams(HttpParams httpParams) {
        HashMap map = this.parameters;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() instanceof String) {
                httpParams.setParameter((String) entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        HashMap map = this.parameters;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public boolean isParameterSet(String str) {
        return getParameter(str) != null;
    }

    public boolean isParameterSetLocally(String str) {
        HashMap map = this.parameters;
        return (map == null || map.get(str) == null) ? false : true;
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        HashMap map = this.parameters;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        if (this.parameters == null) {
            this.parameters = new HashMap();
        }
        this.parameters.put(str, obj);
        return this;
    }

    public void setParameters(String[] strArr, Object obj) {
        for (String str : strArr) {
            setParameter(str, obj);
        }
    }
}
