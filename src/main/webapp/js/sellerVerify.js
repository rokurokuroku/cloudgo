$(document).ready(function() {
        $('#defaultForm').bootstrapValidator({
            message: '无效输入',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                sellerName: {
                    message: '用户名不正确',
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            min: 6,
                            max: 20
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/
                        },
                        remote: {
                            url: 'checkSellerName',
                            message: '该用户名已存在'
                        },
                        different: {
                            field: 'sellerPassword',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                sellerEmail: {
                    validators: {
                        emailAddress: {}
                    }
                },
                sellerPassword: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'reSellerPassword',
                            message: '两次输入密码不一致'
                        },
                        different: {
                            field: 'sellerName',
                            message: '密码和用户名不能相同'
                        }
                    }
                },
                reSellerPassword: {
                    validators: {
                        notEmpty: {},
                        identical: {
                            field: 'sellerPassword'
                        },
                        different: {
                            field: 'sellerName',
                            message: '用户名和密码不能相同'
                        }
                    }
                },

                sellerTelephone: {
                    validators: {
                        notEmpty: {},
                        digits: {},
                        phone: {
                            country: 'cn'
                        }
                    }
                },

                'languages[]': {
                    validators: {
                        notEmpty: {}
                    }
                },
                'programs[]': {
                    validators: {
                        choice: {
                            min: 2,
                            max: 4
                        }
                    }
                }
            }
        });
    });
