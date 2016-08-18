package org.wso2.carbon.sample.user.operation.event.listener;

import org.wso2.carbon.user.core.service.RealmService;

public class DataHolder {

    private static RealmService realmService;
    private static volatile DataHolder dataHolder;
    private static SampleUserOperationEventListener customUserOperationEventListener;

    private DataHolder() {

    }

    public static DataHolder getInstance() {

        if (dataHolder == null) {

            synchronized (DataHolder.class) {
                if (dataHolder == null) {
                    dataHolder = new DataHolder();
                    customUserOperationEventListener = new SampleUserOperationEventListener();
                }
            }

        }

        return dataHolder;
    }

    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }

    public RealmService getRealmService() {
        return realmService;
    }

    public SampleUserOperationEventListener getCustomUserOperationEventListener() {
        return customUserOperationEventListener;
    }

}
