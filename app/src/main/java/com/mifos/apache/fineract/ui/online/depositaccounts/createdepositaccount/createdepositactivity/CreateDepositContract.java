package com.mifos.apache.fineract.ui.online.depositaccounts.createdepositaccount.createdepositactivity;

import com.mifos.apache.fineract.data.models.deposit.ProductInstance;
import com.mifos.apache.fineract.ui.base.MvpView;

/**
 * @author Rajan Maurya
 *         On 15/08/17.
 */
public interface CreateDepositContract {

    interface View extends MvpView {

        void depositCreatedSuccessfully();

        void depositUpdatedSuccessfully();

        void showProgressbar();

        void hideProgressbar();

        void showError(String message);
    }

    interface Presenter {

        void createDepositAccount(ProductInstance productInstance);

        void updateDepositAccount(ProductInstance productInstance);
    }
}
