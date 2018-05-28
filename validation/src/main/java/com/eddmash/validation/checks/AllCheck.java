package com.eddmash.validation.checks;
/*
 * This file is part of the androidcomponents package.
 *
 * (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import java.util.ArrayList;

/**
 * This is an implementation of {@link CheckCompound}.
 * <p>
 * Ensures all are validation checks are valid.
 * <p>
 * If the no checks are provided i.e. checkList is empty, validation will always pass for this
 * check.
 */
public class AllCheck extends CheckCompound {

    private ArrayList<CheckInterface> failedChecks;

    public AllCheck(String errorMessage) {
        super(errorMessage);
        failedChecks = new ArrayList<>();
    }

    @Override
    public boolean run() {
        failedChecks.clear();
        boolean status = true;
        for (CheckInterface check : checkList) {
            if (!check.run()) {
                status = false;
                failedChecks.add(check);
            }
        }
        return status;
    }

    @Override
    public void setError(String error) {
        setViewError(failedChecks, error);
    }

    @Override
    public void disableCheck(CheckInterface checkInterface) {
        super.disableCheck(checkInterface);
        failedChecks.remove(checkInterface);
    }

    @Override
    public void clearError() {
        super.clearError();
        clearViewErrors(failedChecks);
    }
}
